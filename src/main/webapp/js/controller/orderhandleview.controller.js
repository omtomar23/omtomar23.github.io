(function () {
    'use strict';

    angular
        .module('app')
        .controller('OrderHandleViewController', OrderHandleViewController);

    OrderHandleViewController.$inject = ['OrderService','$location', '$rootScope','$scope', 'FlashService'];
    function OrderHandleViewController(OrderService, $location, $rootScope, $scope, FlashService) {
        var vm = this;
        vm.createOrder = createOrder;
        
        function createOrder(){
        	vm.dataLoading = true;
            OrderService.CreateOrder(vm.firstName, vm.lastName, vm.emailId, vm.phoneNo,
            		vm.address, vm.data.garmentType, vm.orderPrice , function (response) {
                if (response.success) {
                    if (response.step === 2) {
                        $location.path('/home');

                    } else
                        $location.path('/orderHandleView');
                } else {
                    FlashService.Error(response.message);
                    vm.dataLoading = false;
                }
            });
        };
        
        vm.data = {
        		garmentType: null,
        	    availableOptions: [
        	      {id: 'Shirt', name: 'Shirt'},
        	      {id: 'Suit', name: 'Suit'},
        	      {id: 'Kurti', name: 'Kurti'},
        	      {id: 'Blouse', name: 'Blouse'},
        	      {id: 'Coast', name: 'Coast'},
        	      {id: 'Plazzo', name: 'Plazzo'},
        	      {id: 'Pant', name: 'Pant'},
        	    ],
        	   };
    }

})();