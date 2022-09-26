$('document').ready(function(){
    console.log("1 Student document ready func()");

    // # STUDENT SCRIPT START
	$('.table #editButton').on('click',function(event){
		event.preventDefault();

		var href= $(this).attr('href');
		console.log("2 .table .btn onClick, func()");

    $.get(href, function(student, status){
			$('#IdEdit').val(student.id);
			$('#nameEdit').val(student.name);
			$('#departmentEdit').val(student.department);
			$('#updatedByEdit').val(student.updatedBy);
			$('#updatedOnEdit').val(student.updatedOn.substr(0,10));
		});
        $('#editModal').modal();
        console.log("3 edit .modal()");

    });

    $('.table #deleteButton').on('click',function(event) {
    		event.preventDefault();
    		var href = $(this).attr('href');
    		$('#deleteModal #delRef').attr('href', href);
    		$('#deleteModal').modal();

    	}); // # STUDENT SCRIPT END



});

//$.get(href, function(student, status){
//        			$('#edit-title').val(ticket.title);
//        			$('#edit-desc').val(ticket.description);
//
//        		});


//        $.get(href, function(user, status){
//                    $('#first-name').val(user.firstname);
//                    $('#last-name').val(user.lastname);
//                    console.log("3 .get href user");
//        });
//        $('#userEditModal').modal();
//        console.log("4 user .modal()");