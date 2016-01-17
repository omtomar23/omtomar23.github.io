(function () {
    'use strict';

    angular
        .module('app')
        .controller('HomeController', HomeController);

    HomeController.$inject = ['UserService','AuthenticationService','$location', '$rootScope','$scope'];
    function HomeController(UserService, AuthenticationService, $location, $rootScope, $scope) {
        var vm = this;
        vm.firstName = $rootScope.globals.currentUser.firstname;
        vm.lastName = $rootScope.globals.currentUser.lastname;
    }

})();