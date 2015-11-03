(function () {
    'use strict';

    angular
        .module('app')
        .controller('LoginController', LoginController);

    LoginController.$inject = ['$location', 'AuthenticationService', 'FlashService'];
    function LoginController($location, AuthenticationService, FlashService) {
        var vm = this;

        vm.login = login;

        (function initController() {
            // reset login status
            AuthenticationService.ClearCredentials();
        })();

        function login() {
            vm.dataLoading = true;
            AuthenticationService.Login(vm.emailId, vm.password, function (response) {
                if (response.success) {
                    AuthenticationService.SetCredentials(response.userdata);

                    if (response.step === 2) {
                        AuthenticationService.SetUserFanData(response.userdata);
                        $location.path('/home');

                    } else
                        $location.path('/register/step1');
                } else {
                    FlashService.Error(response.message);
                    vm.dataLoading = false;
                }
            });
        };
    }

})();
