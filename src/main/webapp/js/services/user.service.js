(function () {
    'use strict';

    angular
        .module('app')
        .factory('UserService', UserService);

    UserService.$inject = ['$http','$rootScope'];
    function UserService($http,$rootScope) {
        var service = {};
        $http.defaults.headers.post["Content-Type"] = "application/x-www-form-urlencoded";
        service.Create = Create;
        service.AddTeam = AddTeam;
        service.Login = Login;
        service.fanOf = [];
        service.UpdateFanData = UpdateFanData;
        //UpdateFanData();
        return service;

        function UpdateFanData()
        {
            var counter = 0;
            if(!($rootScope.globals && $rootScope.globals.currentUser && $rootScope.globals.currentUser.teams && $rootScope.globals.currentUser.tournaments))
                return;
            for(var i = 0; i < $rootScope.globals.currentUser.teams.length; i++)
            {
                var team = $rootScope.globals.currentUser.teams[i];
                var obj = {
                    index:counter,
                    type:"team",
                    id: team.teamid,
                    name:team.name
                };
                this.fanOf.push(obj);
                console.log(obj);
                counter++;
            }

            for(var i = 0; i < $rootScope.globals.currentUser.tournaments.length; i++)
            {
                var tournament = $rootScope.globals.currentUser.tournaments[i];
                var obj = {
                    index:counter,
                    type:"tournament",
                    id: tournament.tournamentid,
                    name:tournament.name
                };
                this.fanOf.push(obj);
                console.log(obj);
                counter++;
            }

        }
        function Create(user) {
            return $http({
                url: '/tgtsfans/registeruser',
                method: 'POST',
                data: $.param({"payload": JSON.stringify(user),"command":"step0"}),
                headers: {'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'}
            }).then(handleSuccess, handleError('Error creating user'));
        }

        function AddTeam(userid,authData,payload) {
            return $http({
                url: '/tgtsfans/registeruser',
                method: 'POST',
                data: $.param({"payload": JSON.stringify(payload),"command":"step1","userid":userid,"authdata":authData}),
                headers: {'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'}
            }).then(handleSuccess, handleError('Error creating user'));
        }

        function Login(emailId,password) {
            return $http({
                url: '/tailerManager/login',
                method: 'POST',
                data: $.param({"command":"login","emailId":emailId,"password":password}),
                headers: {'Content-Type': 'application/x-www-form-urlencoded;charset=utf-8'}
            }).then(handleSuccess, handleError('Error creating user'));
        }

        function handleSuccess(res) {
            return res.data;
        }

        function handleError(error) {
            return function () {
                return { success: false, message: error };
            };
        }
    }

})();
