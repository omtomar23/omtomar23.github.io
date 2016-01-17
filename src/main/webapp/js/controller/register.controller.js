(function () {
    'use strict';

    angular
        .module('app')
        .controller('RegisterController', RegisterController);

    RegisterController.$inject = ['$location', 'AuthenticationService', 'FlashService'];
    function RegisterController($location, AuthenticationService, FlashService) {
        var vm = this;

        vm.createUser = createUser;
        function createUser() {
            vm.dataLoading = true;
            AuthenticationService.CreateUser(vm.firstName, vm.lastName, vm.emailId, vm.password, vm.confirmPassword, function (response) {
                if (response.success) {
                    if (response.step === 1) {
                        $location.path('/login');

                    } else
                        $location.path('/register');
                } else {
                    FlashService.Error(response.message);
                    vm.dataLoading = false;
                }
            });
        };
    }

})();
