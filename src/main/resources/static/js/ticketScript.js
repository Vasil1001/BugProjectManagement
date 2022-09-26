
$('document').ready(function(){
    console.log("1 ticket document ready func()");
// # TICKET SCRIPT START
    $('.table #ticketsEditButton').on('click',function(event){
            event.preventDefault();

            var href= $(this).attr('href');
            console.log("2 .table .btn onClick, func()");

        $.get(href, function(ticket, status){
            $('#ticket-edit-id').val(ticket.id);
            $('#ticket-edit-title').val(ticket.title);
            $('#ticket-edit-description').val(ticket.description);
            });
            $('#ticketEditModal').modal();
            console.log("3 edit .modal()");

        });

        $('.table #ticketsDeleteButton').on('click',function(event) {
                event.preventDefault();
                var href = $(this).attr('href');
                $('#ticketDeleteModal #ticketDelRef').attr('href', href);
                $('#ticketDeleteModal').modal();

        }); // # TICKET SCRIPT END

});