/*function hello($scope, $http) {
	if($scope.name == undefined) {
		$scope.name = 'Vinay';
	}
	var path = 'http://localhost:8080/greeting/rest/greet/'+$scope.name;
	$http.get(path)
		.success(function(data) {
			$scope.greeting = data;
		});

	$scope.update = function() {
		var path = 'http://localhost:8080/greeting/rest/greet/'+$scope.name;
		alert(path)
		$http.get(path)
			.success(function(data) {
				$scope.greeting = data;
			});
	}
}*/


var helloApp = angular.module('hello-app',[]);
helloApp.controller('helloController',function($scope,$http) {
	if($scope.name == undefined) {
		$scope.name = 'Vinay';
	}
	var path = 'http://localhost:8080/greeting/rest/greet?name='+$scope.name;
	$http.get(path)
		.success(function(data) {
			$scope.greeting = data;
		});
	
	$scope.greet = function() {
		var path = 'http://localhost:8080/greeting/rest/greet?name='+$scope.name;
		alert(path)
		$http.get(path)
			.success(function(data) {
				$scope.greeting = data;
			});
	}
});