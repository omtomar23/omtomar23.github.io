(function () {
    'use strict';

    angular
        .module('app')
        .factory('OrderService', OrderService);

    OrderService.$inject = ['$http', '$cookieStore', '$rootScope', '$timeout', 'UserService'];
    function OrderService($http, $cookieStore, $rootScope, $timeout, UserService) {
        var service = {};
        service.CreateOrder = CreateOrder;
        return service;
        
        function CreateOrder(firstName, lastName, emailId, phoneNo, address, garmentType, price,callback) {
            $timeout(function () {
                var response;
                UserService.CreateOrder(firstName, lastName, emailId, phoneNo, address, garmentType, price)
                    .then(function (response) {
                        callback(response);
                    });
            }, 10000);
        }
        
    }

})();