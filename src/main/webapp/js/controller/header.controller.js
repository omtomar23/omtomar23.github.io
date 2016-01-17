(function () {
    'use strict';

    angular
        .module('app')
        .controller('HeaderController', HeaderController);

    HeaderController.$inject = ['UserService','AuthenticationService','$location', '$rootScope','$scope'];
    function HeaderController(UserService, AuthenticationService, $location, $rootScope, $scope) {
       var vm = this;
       vm.user = null;
       vm.allUsers = [];
        //$scope.firstName = $rootScope.globals.currentUser.firstname;
        $scope.logout = logout;

        function logout() {
            AuthenticationService.ClearCredentials();
            $location.path('/login');
        }
    }

})();