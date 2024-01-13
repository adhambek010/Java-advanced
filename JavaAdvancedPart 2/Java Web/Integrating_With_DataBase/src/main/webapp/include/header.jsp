<header class="header_section">
  <div class="container">
    <nav class="navbar navbar-expand-lg custom_nav-container">
      <a class="navbar-brand" href="index.html">
        <img src="path/to/logo.png" alt="Feane Logo">
      </a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
        <ul class="navbar-nav mx-auto">
          <li >
            <a href="<%= request.getContextPath() %>/Home?page=home">Home</a>
          </li>
          <li>
            <a href="<%= request.getContextPath() %>/Home?page=menu">Menu</a>
          </li>
          <li >
            <a href="<%= request.getContextPath() %>/Home?page=about">About</a>
          </li>
          <li>
            <a href="<%= request.getContextPath() %>/Home?page=book">Book</a>
          </li>
        </ul>
    </nav>
  </div>
</header>
