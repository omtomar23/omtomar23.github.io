(function () {
    'use strict';

    angular
        .module('app')
        .directive('appHeader', AppHeaderDirective);

    function AppHeaderDirective($rootScope) {
        return {
            restrict : 'E',
            controller: 'HeaderController',
            templateUrl : 'template/header.view.html'
        };
    }

})();