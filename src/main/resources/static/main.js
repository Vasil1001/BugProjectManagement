

$('document').ready(function(){	
    console.log(" works so far");
 
	$('.table .editButton').on('click',function(event){	
        console.log("It works so far");

		event.preventDefault();
		
        $.get(href, function(ticket, status){
            $('#edit-title').val(ticket.title);
            $('#edit-description').val(ticket.description);

        });

		$('#ticketAddModal').modal();			

	});	
});