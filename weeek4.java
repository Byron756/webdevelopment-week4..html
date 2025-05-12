document.getElementById("changeTextBtn").addEventListener("click", function () {
  document.getElementById("infoText").textContent = "Text has been updated!";
});

document.getElementById("toggleBoxBtn").addEventListener("click", function () {
  const box = document.getElementById("box");
  box.classList.toggle("hidden");
  box.style.backgroundColor = box.style.backgroundColor === "lightblue" ? "lightgreen" : "lightblue";
});

document.getElementById("addItemBtn").addEventListener("click", function () {
  const newItem = document.createElement("li");
  newItem.textContent = `Item ${document.getElementById("itemList").children.length + 1}`;
  document.getElementById("itemList").appendChild(newItem);
});
