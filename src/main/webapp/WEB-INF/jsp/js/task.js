var app = angu



/*var projectList = "";
$(function() {

	$.get("/AssignTask", function(data, status) {

		var projectNameList = JSON.parse(data);
		console.log(data)
		console.log(projectNameList)
		var $select = $('#down');
		$select.find('option').remove();
		var j = 0;
		$.each((projectNameList), function(key, value) {
			var list = projectNameList[j];
			$select.append('<option value=' + list[1] + '>' + list[0]
					+ '</option>');
			++j;
		});
		$(".getProgect").click(
				function() {
					var employeeList = "";
					var conceptName = $('#down').find(":selected").text();
					console.log(conceptName);
					
					$.ajax({
						type : "POST",
						url : "/viewEmployeesInTask",
						data : conceptName,
						contentType : "application/json; charset=utf-8",
						dataType : "json",
						success : function(empData) {
							employeeList = empData;
							console.log(empData)
							var $select = $('#emplist');
							var i = 0;
							$select.find('option').remove();
							$.each((employeeList), function(key, value) {
								$select.append('<option value='
										+ employeeList[i].employeeName + '>'
										+ employeeList[i].employeeName
										+ '</option>');
								++i;
							});
						}
					});

				});
	});
	$('#submitData').click(function() {
		

		var inputs = $('#myForm :input');

		var values = {};
		inputs.each(function() {

			values[this.name] = $(this).val();

		});
		var list = {
			employeeName : ""
		};
		inputs.each(function() {

			if (this.name != "employeeName") {

				list[this.name] = $(this).val();
			}

		});
		var projectDetails = values;
		var projectData;
		console.log(projectDetails)
		console.log(projectDetails.description)
		console.log(projectDetails.employeeName.length)

		var i;
		for (i = 0; i < projectDetails.employeeName.length; ++i) {
			list.employeeName = projectDetails.employeeName[i];
			console.log(list)
			$.ajax({
				async : false,

				type : "POST",
				url : "saveProjectDetails",
				data : JSON.stringify(list),
				beforeSend : function(xhr) {
					xhr.setRequestHeader("Accept", "application/json");
					xhr.setRequestHeader("Content-Type", "application/json");
				},
				contentType : "application/json; charset=utf-8",
				dataType : "json",
				success : function(message) {
					alert("Details updated successfully");
				}
			});

		}

	});

	$.get("getProjectList", function(data, status) {

		var viewProjectList = JSON.parse(data);
		console.log(data)
		console.log(viewProjectList)
		var $select = $('#viewProject');
		$select.find('option').remove();
		var j = 0;

		$select.append('<option value=' + 'allProject' + '>'
				+ 'Select All Project' + '</option>');
		
		$.each((viewProjectList), function(key, value) {
			var viewList = viewProjectList[j];
			$select.append('<option value=' + viewList[0] + '>' + viewList[0]
					+ '</option>');
			++j;
		});
	});
})

var app = angular.module('viewTask', []);
app.controller('viewTaskController', function($scope, $http) {
	$scope.getProjectDetails = function(val) {
		$scope.projectId = [];
		$scope.projectDescription = [];
		console.log($scope.getProjectName);
		if (angular.isUndefined(val) || val == "allProject") {
			var host = window.location.host;
			var jsonurl = "http://" + host
					+ "/TaskManagement/AssignTask";
			$http.get(jsonurl).then(function(response) {

				$scope.projectList = response.data;
				console.log($scope.projectList);
				angular.forEach($scope.projectList, function(value, key) {
					$scope.projectId.push(value.description);

				})
				console.log($scope.projectId);

				$scope.newList = [];
				var uniqueNames = [];
				$.each($scope.projectId, function(i, el) {
					if ($.inArray(el, uniqueNames) === -1)
						uniqueNames.push(el);
				});
				console.log(uniqueNames)
				$scope.projectDescription = uniqueNames;
				console.log($scope.projectDescription)
			})

			angular.forEach($scope.projectList, function(value, key) {

				angular.forEach($scope.projectDescription, function(value1,
						key1) {
					if (value1 == value.description) {
						$scope.newList.push($scope.projectList);
					}

				})
			})
			console.log("value" + $scope.newList)
		} else {
			var specifiedProjectDetails = $http.post(
					'fetchGivenProjectDetails', val);
			specifiedProjectDetails.success(function(data, status, headers,
					config) {
				console.log(data);
				$scope.projectList = data;

			});
		}

	}

});
*/