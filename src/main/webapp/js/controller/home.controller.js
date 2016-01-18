(function () {
    'use strict';

    angular
        .module('app')
        .controller('HomeController', HomeController);

    HomeController.$inject = ['UserService','AuthenticationService','$location', '$rootScope','$scope'];
    function HomeController(UserService, AuthenticationService, $location, $rootScope, $scope) {
        var vm = this;
        vm.openOrderHandleView = openOrderHandleView;
        
        vm.readAllUser = readAllUser;
        
        function openOrderHandleView(){
        	$location.path('/orderHandleView');
        };
        
        function readAllUser(){
        	AuthenticationService.ReadAllUser(function (response) {
        		console.log(response.userDetails);
        		for(var element in response.userDetails){
        			console.log(response.userDetails[element].userId);
        			console.log(response.userDetails[element].userName);
        		}
        			
        	});
        };
    }

})();