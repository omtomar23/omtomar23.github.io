(function () {
    'use strict';

    angular
        .module('app')
        .controller('LoginController', LoginController);

    LoginController.$inject = ['$location', 'AuthenticationService', 'FlashService'];
    function LoginController($location, AuthenticationService, FlashService) {
        var vm = this;

        vm.login = login;
        vm.register = register;

        (function initController() {
            // reset login status
            AuthenticationService.ClearCredentials();
        })();

        function login() {
            vm.dataLoading = true;
            AuthenticationService.Login(vm.emailId, vm.password, function (response) {
                if (response.success) {
                    if (response.step === 2) {
                        AuthenticationService.SetCredentials(response.userData);
                        $location.path('/home');

                    } else
                        $location.path('/register');
                } else {
                    FlashService.Error(response.message);
                    vm.dataLoading = false;
                }
            });
        };
        
        function register(){
        	AuthenticationService.ClearCredentials();
        	$location.path('/register');
        };
    }

})();
