var empModule = angular.module('empApp',[]);

empModule.controller('Employee', function($scope, $http) {
	
	$scope.add = function() {
		var empObj = {
				"name":$scope.employee.name,
				"id":$scope.employee.id
		};
		
		var response = $http.post('http://localhost:8080/greeting/rest/employee/add',empObj);
		response.success(function(data, status, headers, config) {
			$scope.responseStatus = data;
			
		});
		response.error(function(data, status, headers, config) {
			$scope.responseStatus = data;
			$http.get('http://localhost:8080/greeting/rest/employee')
			.success(function(data,status, headers, config){
				$scope.list = data;
			})
			.error(function(data, status, headers, config) {
			alert("Exception Details : "+JSON.stringify({data:data}));
		});
		});
	}
	
	$scope.list = function() {
		$http.get('http://localhost:8080/greeting/rest/employee')
			.success(function(data,status, headers, config){
				$scope.list = data;
			})
			.error(function(data, status, headers, config) {
			alert("Exception Details : "+JSON.stringify({data:data}));
		});
	}
});