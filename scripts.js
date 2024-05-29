$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/books",
        method: "GET",
        success: function(data) {
            data.forEach(function(book) {
                $('#books').append(`
                    <div class="book">
                        <img src="${book.image}" alt="${book.title}">
                        <h2>${book.title}</h2>
                        <p>${book.author}</p>
                    </div>
                `);
            });
        },
        error: function(error) {
            console.error("There was an error fetching the books!", error);
        }
    });
});