var phoneCatApp = angular.module('phoneCatApp', []);

phoneCatApp.controller('PhoneListCtrl', function($scope) {
	$scope.phones = [{name : 'Nexus S', snippet: 'Fast just got faster with Nexus S'},
	                {name : 'Moto G3', snippet: 'Good mobile with basic features'}]
});
