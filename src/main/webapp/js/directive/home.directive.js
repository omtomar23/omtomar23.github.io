(function () {
    'use strict';

    angular
        .module('app')
        .directive('view', AppHomeDirective);

    function AppHomeDirective($rootScope) {
        return {
            restrict : 'E',
            controller: 'HomeController',
            templateUrl : 'template/register.view.html'
        };
    }

})();