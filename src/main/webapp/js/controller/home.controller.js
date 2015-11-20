(function () {
    'use strict';

    angular
        .module('app')
        .controller('HomeController', HomeController);

    HomeController.$inject = ['UserService','AuthenticationService','$location', '$rootScope','$scope'];
    function HomeController(UserService, AuthenticationService, $location, $rootScope, $scope) {
        var vm = this;
        vm.user = null;
        vm.allUsers = [];
        $scope.firstName = $rootScope.globals.currentUser.firstname;
        $scope.lastName = $rootScope.globals.currentUser.lastname;

        function logout() {
            AuthenticationService.ClearCredentials();
            $location.path('/login');
        }
    }

})();