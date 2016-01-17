(function () {
    'use strict';

    angular
        .module('app')
        .factory('AuthenticationService', AuthenticationService);

    AuthenticationService.$inject = ['$http', '$cookieStore', '$rootScope', '$timeout', 'UserService'];
    function AuthenticationService($http, $cookieStore, $rootScope, $timeout, UserService) {
        var service = {};

        service.Login = Login;
        service.SetCredentials = SetCredentials;
        service.SetUserFanData = SetUserFanData;
        service.ClearCredentials = ClearCredentials;
        service.CreateUser = CreateUser;
        return service;

        function Login(emailId, password, callback) {

            /* Dummy authentication for testing, uses $timeout to simulate api call
             ----------------------------------------------*/
            $timeout(function () {
                var response;
                UserService.Login(emailId, password)
                    .then(function (response) {
                        callback(response);
                    });
            }, 10000);

            /* Use this for real authentication
             ----------------------------------------------*/
            //$http.post('/api/authenticate', { username: username, password: password })
            //    .success(function (response) {
            //        callback(response);
            //    });

        }
        
        
        function CreateUser(firstName, lastName, emailId, password, confirmPassword,callback) {
            $timeout(function () {
                var response;
                UserService.CreateUser(firstName, lastName, emailId, password, confirmPassword)
                    .then(function (response) {
                        callback(response);
                    });
            }, 10000);
        }
        

        function SetCredentials(userdata) {
            $rootScope.globals = {
                currentUser: {
                    //userid: userdata.userid,
                    //authdata: userdata.authdata,
                	
                	firstname:userdata.firstName,
                	lastname:userdata.lastName
                }
            };
            $http.defaults.headers.common['Authorization'] = 'Basic ' + userdata.authdata; // jshint ignore:line
            $cookieStore.put('globals', $rootScope.globals);
        }

        function SetUserFanData(userdata) {
            $rootScope.globals.currentUser.teams =userdata.teams;
            $rootScope.globals.currentUser.tournaments =userdata.tournaments;
            $cookieStore.put('globals', $rootScope.globals);
            UserService.UpdateFanData();
        }

        function ClearCredentials() {
            console.log('clear cookie get called');
            $rootScope.globals = {};
            $cookieStore.remove('globals');
            $http.defaults.headers.common.Authorization = 'Basic ';
        }
    }

})();