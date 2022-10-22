
$('document').ready(function () {
    console.log("1 ticket document ready func()");


    //$('#ticketsListDataTable').DataTable();

    // # TICKET SCRIPT START
    $('.table #ticketsEditButton').on('click', function (event) {
        event.preventDefault();

        var href = $(this).attr('href');
        console.log("2 .table .btn onClick, func()");

        $.get(href, function (ticket, status) {
            $('#ticket-edit-id').val(ticket.Id);
            $('#ticket-edit-title').val(ticket.title);
            $('#ticket-edit-description').val(ticket.description);

        });
        $('#ticketEditModal').modal();
        console.log("3 edit .modal()");

    });

    $('.table #ticketsDeleteButton').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $('#ticketDeleteModal1 #ticketDelRef1').attr('href', href);
        $('#ticketDeleteModal1').modal();

    }); // # TICKET SCRIPT END

});