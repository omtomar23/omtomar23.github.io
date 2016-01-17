(function () {
    'use strict';

    angular
        .module('app')
        .directive('view', AppRegisterDirective);

    function AppRegisterDirective($rootScope) {
        return {
            restrict : 'E',
            controller: 'RegisterController',
            templateUrl : 'template/register.view.html'
        };
    }

})();