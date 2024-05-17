<%@page language="java" contentType="text/html; charset=UTF-8"
        isELIgnored="false" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1, shrink-to-fit=no"
    />
    <!-- Bootstrap CSS -->
    <script src="https://cdn.jsdelivr.net/npm/flatpickr"></script>
    <script src="https://cdn.tailwindcss.com"></script>
    <link
      rel="stylesheet"
      href="../resources/assets/vendor/bootstrap/css/bootstrap.min.css"
    />
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/flatpickr/dist/flatpickr.min.css" />

    <link href="../resources/assets/vendor/fonts/circular-std/style.css" rel="stylesheet" />
    <link rel="stylesheet" href="assets/libs/css/style.css" />
    <link
      rel="stylesheet"
      href="../resources/assets/vendor/fonts/fontawesome/css/fontawesome-all.css"
    />
    <link
      rel="stylesheet"
      href="../resources/assets/vendor/charts/chartist-bundle/chartist.css"
    />
    <link
      rel="stylesheet"
      href="../resources/assets/vendor/charts/morris-bundle/morris.css"
    />
    <link
      rel="stylesheet"
      href="../resources/assets/vendor/fonts/material-design-iconic-font/css/materialdesignicons.min.css"
    />
    <link rel="stylesheet" href="../resources/assets/vendor/charts/c3charts/c3.css" />
    <link
      rel="stylesheet"
      href="../resources/assets/vendor/fonts/flag-icon-css/flag-icon.min.css"
    />
    <link
      rel="stylesheet"
      href="../resources/assets/vendor/bootstrap/css/bootstrap.min.css"
    />
    <link
      href="../resources/assets/vendor/fonts/circular-std/style.css"
      rel="stylesheet"
    />
    <link rel="stylesheet" href="../resources/assets/libs/css/style.css" />
    <link
      rel="stylesheet"
      href="../resources/assets/vendor/fonts/fontawesome/css/fontawesome-all.css"
    />
    <title>Order a delivery</title>
  </head>

  <body>
    <div class="flex flex-row">

        <div
      style="height: 100vh"
      class="flex flex-col p-3 w-60 dark:bg-gray-50 dark:text-gray-800"
    >
      <div class="space-y-3">
        <div class="flex items-center justify-between">
          <h2>Dashboard</h2>
        </div>

        <div class="flex-1">
          <ul class="pt-2 pb-4 space-y-1 text-sm">
            <li class="rounded-sm">
              <a
                rel="noopener noreferrer"
                href="#"
                class="flex items-center p-2 space-x-3 rounded-md"
              >
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  viewBox="0 0 512 512"
                  class="w-5 h-5 fill-current dark:text-gray-600"
                >
                  <path
                    d="M469.666,216.45,271.078,33.749a34,34,0,0,0-47.062.98L41.373,217.373,32,226.745V496H208V328h96V496H480V225.958ZM248.038,56.771c.282,0,.108.061-.013.18C247.9,56.832,247.756,56.771,248.038,56.771ZM448,464H336V328a32,32,0,0,0-32-32H208a32,32,0,0,0-32,32V464H64V240L248.038,57.356c.013-.012.014-.023.024-.035L448,240Z"
                  ></path>
                </svg>
                <span>Home</span>
              </a>
            </li>

            <li class="rounded-sm">
              <a
                rel="noopener noreferrer"
                href="#"
                class="flex items-center p-2 space-x-3 rounded-md"
              >
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  viewBox="0 0 512 512"
                  class="w-5 h-5 fill-current dark:text-gray-600"
                >
                  <path
                    d="M448.205,392.507c30.519-27.2,47.8-63.455,47.8-101.078,0-39.984-18.718-77.378-52.707-105.3C410.218,158.963,366.432,144,320,144s-90.218,14.963-123.293,42.131C162.718,214.051,144,251.445,144,291.429s18.718,77.378,52.707,105.3c33.075,27.168,76.861,42.13,123.293,42.13,6.187,0,12.412-.273,18.585-.816l10.546,9.141A199.849,199.849,0,0,0,480,496h16V461.943l-4.686-4.685A199.17,199.17,0,0,1,448.205,392.507ZM370.089,423l-21.161-18.341-7.056.865A180.275,180.275,0,0,1,320,406.857c-79.4,0-144-51.781-144-115.428S240.6,176,320,176s144,51.781,144,115.429c0,31.71-15.82,61.314-44.546,83.358l-9.215,7.071,4.252,12.035a231.287,231.287,0,0,0,37.882,67.817A167.839,167.839,0,0,1,370.089,423Z"
                  ></path>
                  <path
                    d="M60.185,317.476a220.491,220.491,0,0,0,34.808-63.023l4.22-11.975-9.207-7.066C62.918,214.626,48,186.728,48,156.857,48,96.833,109.009,48,184,48c55.168,0,102.767,26.43,124.077,64.3,3.957-.192,7.931-.3,11.923-.3q12.027,0,23.834,1.167c-8.235-21.335-22.537-40.811-42.2-56.961C270.072,30.279,228.3,16,184,16S97.928,30.279,66.364,56.206C33.886,82.885,16,118.63,16,156.857c0,35.8,16.352,70.295,45.25,96.243a188.4,188.4,0,0,1-40.563,60.729L16,318.515V352H32a190.643,190.643,0,0,0,85.231-20.125,157.3,157.3,0,0,1-5.071-33.645A158.729,158.729,0,0,1,60.185,317.476Z"
                  ></path>
                </svg>
                <span>Customer service</span>
              </a>
            </li>
            <li class="rounded-sm">
              <a
                rel="noopener noreferrer"
                href="#"
                class="flex items-center p-2 space-x-3 rounded-md"
              >
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  width="24"
                  height="24"
                  viewBox="0 0 24 24"
                  fill="none"
                  stroke="#000000"
                  stroke-width="1"
                  stroke-linecap="round"
                  stroke-linejoin="round"
                >
                  <circle cx="10" cy="20.5" r="1" />
                  <circle cx="18" cy="20.5" r="1" />
                  <path
                    d="M2.5 2.5h3l2.7 12.4a2 2 0 0 0 2 1.6h7.7a2 2 0 0 0 2-1.6l1.6-8.4H7.1"
                  />
                </svg>
                <span>Orders</span>
              </a>
            </li>
            <li class="rounded-sm">
              <a
                rel="noopener noreferrer"
                href="#"
                class="flex items-center p-2 space-x-3 rounded-md"
              >
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  width="24"
                  height="24"
                  viewBox="0 0 24 24"
                  fill="none"
                  stroke="#000000"
                  stroke-width="1"
                  stroke-linecap="round"
                  stroke-linejoin="round"
                >
                  <circle cx="12" cy="12" r="10"></circle>
                  <polyline points="12 6 12 12 16 14"></polyline>
                </svg>
                <span>History</span>
              </a>
            </li>
            <li class="rounded-sm">
              <a
                rel="noopener noreferrer"
                href="#"
                class="flex items-center p-2 space-x-3 rounded-md"
              >
                <svg
                  xmlns="http://www.w3.org/2000/svg"
                  viewBox="0 0 512 512"
                  class="w-5 h-5 fill-current dark:text-gray-600"
                >
                  <path
                    d="M440,424V88H352V13.005L88,58.522V424H16v32h86.9L352,490.358V120h56V456h88V424ZM320,453.642,120,426.056V85.478L320,51Z"
                  ></path>
                  <rect width="32" height="64" x="256" y="232"></rect>
                </svg>
                <span>Logout</span>
              </a>
            </li>
          </ul>
        </div>
      </div>
    </div>
    <div class="p-16">
      <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
        <div class="card">
            <h5 class="card-header">Order a shipment</h5>
            <div class="card-body">
                <form class="needs-validation"  novalidate method="post" action="<c:url value ='/order/add'/>">
                    <div class="row">
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                            <label for="validationCustom01">Shipment name</label>
                            <input type="text" class="form-control" id="validationCustom01" name="shipment_name" value="" required>

                        </div>
                        <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                            <label for="validationCustom02">Merchandise type</label>
                            <div class="form-group">
                              <select name="shipment_type" class="form-control">
                                  <option value="Small package delivery">Small package delivery</option>
                                  <option value="Normal delivery">Normal delivery</option>
                                  <option value="Construction material">Construction material</option>
                                  <option value="Risky delivery">Risky delivery</option>
                              </select>
                              <div class="form-group">
                                <label for="inputText3" class="col-form-label">Insert the shipment weight</label>
                                <input id="inputText3" name="weight" type="text" class="form-control">
                            </div>
                          </div>

                        </div>

                    </div>
                    <div class="form-row">
                        <div class="col-xl-4 col-lg-4 col-md-12 col-sm-12 col-12 mb-2">
                            <label for="validationCustom03">Pick-up city</label>
                            <select name="start_destination" class="form-control">
                                <option value="Casablanca">Casablanca</option>
                                    <option value="Rabat">Rabat</option>
                                    <option value="Marrakech">Marrakech</option>
                                    <option value="Fes">Fes</option>
                                    <option value="Tangier">Tangier</option>
                                    <option value="Agadir">Agadir</option>
                                    <option value="Meknes">Meknes</option>
                                    <option value="Oujda">Oujda</option>
                                    <option value="Kenitra">Kenitra</option>
                                    <option value="Tetouan">Tetouan</option>
                                    <option value="Larache">Larache</option>
                                    <option value="Eljadida">El Jadida</option>
                                    <option value="Essaouira">Essaouira</option>
                                    <option value="Nador">Nador</option>
                                    <option value="Safi">Safi</option>
                                    <option value="Beni">Beni Mellal</option>
                                    <option value="Taroudant">Taroudant</option>
                                    <option value="Taza">Taza</option>
                                    <option value="Khouribga">Khouribga</option>
                                    <option value="Berkane">Berkane</option>
                          </select>

                        </div>
                    </div>
                    <div class="form-row">

                      <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/flatpickr/dist/flatpickr.min.css" />
                      <hr class="border-blue-500 border.">

<div class="relative mt-2 h-10 w-full  min-w-[200px]">
  <input
    id="date-picker"
    name="date"
    class="peer h-full w-full rounded-[7px] border border-blue-gray-200 border-t-transparent bg-transparent px-3 py-2.5 font-sans text-sm font-normal text-blue-gray-700 outline outline-0 transition-all placeholder-shown:border placeholder-shown:border-blue-gray-200 placeholder-shown:border-t-blue-gray-200 focus:border-2 focus:border-gray-900 focus:border-t-transparent focus:outline-0 disabled:border-0 disabled:bg-blue-gray-50"
    placeholder=" "
  />
  <label class="before:content[' '] after:content[' '] pointer-events-none absolute left-0 -top-1.5 flex h-full w-full select-none !overflow-visible truncate text-[11px] font-normal leading-tight text-gray-500 transition-all before:pointer-events-none before:mt-[6.5px] before:mr-1 before:box-border before:block before:h-1.5 before:w-2.5 before:rounded-tl-md before:border-t before:border-l before:border-blue-gray-200 before:transition-all after:pointer-events-none after:mt-[6.5px] after:ml-1 after:box-border after:block after:h-1.5 after:w-2.5 after:flex-grow after:rounded-tr-md after:border-t after:border-r after:border-blue-gray-200 after:transition-all peer-placeholder-shown:text-sm peer-placeholder-shown:leading-[3.75] peer-placeholder-shown:text-blue-gray-500 peer-placeholder-shown:before:border-transparent peer-placeholder-shown:after:border-transparent peer-focus:text-[11px] peer-focus:leading-tight peer-focus:text-gray-900 peer-focus:before:border-t-2 peer-focus:before:border-l-2 peer-focus:before:!border-gray-900 peer-focus:after:border-t-2 peer-focus:after:border-r-2 peer-focus:after:!border-gray-900 peer-disabled:text-transparent peer-disabled:before:border-transparent peer-disabled:after:border-transparent peer-disabled:peer-placeholder-shown:text-blue-gray-500">
    Select a Date
  </label>
</div>

                    </div>
                    <div class="form-row">

                        <div class="col-xl-4 col-lg-4 col-md-12 col-sm-12 col-12 mb-2">
                            <label for="validationCustom03">Destination</label>
                            <select name="destination" class="form-control">
                                <option value="Casablanca">Casablanca</option>
                                    <option value="Rabat">Rabat</option>
                                    <option value="Marrakech">Marrakech</option>
                                    <option value="Fes">Fes</option>
                                    <option value="Tangier">Tangier</option>
                                    <option value="Agadir">Agadir</option>
                                    <option value="Meknes">Meknes</option>
                                    <option value="Oujda">Oujda</option>
                                    <option value="Kenitra">Kenitra</option>
                                    <option value="Tetouan">Tetouan</option>
                                    <option value="Larache">Larache</option>
                                    <option value="Eljadida">El Jadida</option>
                                    <option value="Essaouira">Essaouira</option>
                                    <option value="Nador">Nador</option>
                                    <option value="Safi">Safi</option>
                                    <option value="Beni">Beni Mellal</option>
                                    <option value="Taroudant">Taroudant</option>
                                    <option value="Taza">Taza</option>
                                    <option value="Khouribga">Khouribga</option>
                                    <option value="Berkane">Berkane</option>
                          </select>


                    </div>


                    </div>
                    <div class="form-row">

                    </div>
                    <div class="form-row">

                    </div>

                  <div class="form-group">
                    <label for="inputText3" class="col-form-label">Distance</label>
                    <input id="inputText5" type="text" name="distance" class="form-control">
                </div>
                    <div class="form-row">
                      <div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12 ">
                        <button class="btn btn-primary" type="submit">Order shipment</button>
                    </div>

                    </div>

                </form>
            </div>
        </div>

    </div>
    <!-- ============================================================== -->
    <!-- end validation form -->
    <!-- ============================================================== -->

</div>
    </div>

    </div>


    <script>
      const numberInput = document.getElementById("inputText5");

numberInput.addEventListener("keydown", function(event) {
  // Allow backspace, delete, tab, arrow keys, and escape
  if (event.keyCode === 8 || event.keyCode === 46 || event.keyCode === 9 || event.keyCode >= 37 && event.keyCode <= 40 || event.keyCode === 27) {
    return;
  }
  // Allow only numbers and decimal point (.)
  if (!event.key.match(/^[0-9.]$/)) {
    event.preventDefault();
  }
});

      const inputText3 = document.getElementById("inputText3");

inputText3.addEventListener("keydown", function(event) {
  // Allow backspace, delete, tab, left/right arrows, and home/end keys
  if (event.keyCode === 8 || event.keyCode === 46 || event.keyCode === 9 ||
      (event.keyCode >= 35 && event.keyCode <= 40)) {
    return;
  }

  // Allow only numbers and prevent decimal (.) for non-negative values
  if (!/[0-9]/.test(event.key)) {
    event.preventDefault();
  }
});
const datepicker = flatpickr("#date-picker", {});



// Add an event listener for keydown event
inputElement.addEventListener('keydown', function(event) {
    // Allow: backspace, delete, tab, escape, enter, and .
    if ([46, 8, 9, 27, 13, 110, 190].indexOf(event.keyCode) !== -1 ||
        // Allow: Ctrl+A, Command+A
        (event.keyCode === 65 && (event.ctrlKey === true || event.metaKey === true)) ||
        // Allow: Ctrl+C, Command+C
        (event.keyCode === 67 && (event.ctrlKey === true || event.metaKey === true)) ||
        // Allow: Ctrl+V, Command+V
        (event.keyCode === 86 && (event.ctrlKey === true || event.metaKey === true)) ||
        // Allow: Ctrl+X, Command+X
        (event.keyCode === 88 && (event.ctrlKey === true || event.metaKey === true)) ||
        // Allow: home, end, left, right
        (event.keyCode >= 35 && event.keyCode <= 39)) {
        // Let it happen, don't do anything
        return;
    }
    // Ensure that it is a number and stop the keypress
    if ((event.shiftKey || (event.keyCode < 48 || event.keyCode > 57)) &&
        (event.keyCode < 96 || event.keyCode > 105)) {
        event.preventDefault();
    }
});

    </script>
  </body>

</html>
