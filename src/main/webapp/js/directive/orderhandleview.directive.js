(function () {
    'use strict';

    angular
        .module('app')
        .directive('view', AppOrderHandleViewDirective);

    function AppOrderHandleViewDirective($rootScope) {
        return {
            restrict : 'E',
            controller: 'OrderHandleViewController',
            templateUrl : 'template/orderhandle.view.html'
        };
    }

})();