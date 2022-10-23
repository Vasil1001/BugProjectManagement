$('document').ready(function () {

    console.log("1 Project script.js loaded - ready func()");
    // # TICKET SCRIPT START
    $('.table #projectsEditButton').on('click', function (event) {
        event.preventDefault();

        var href = $(this).attr('href');
        console.log("2 .table .btn onClick, func()");

        $.get(href, function (project, status) {
            $('#project-edit-name').val(project.name);
            $('#project-edit-description').val(project.description);
        });
        $('#projectEditModal').modal();
        console.log("3 edit .modal()");

    });

    $('.table #projectsDeleteButton').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $('#projectDeleteModal #projectDelRef').attr('href', href);
        $('#projectDeleteModal').modal();

    }); // # TICKET SCRIPT END

});