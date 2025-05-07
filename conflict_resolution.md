Merge Conflict Шийдвэрлэсэн нь
1. feature/add-multiplication болон feature/add-division салбарууд хоёулаа Calculator.java файлд өөр өөр аргаар өөрчлөлт оруулсан. Тэдгээрийг develop салбарт merge хийхэд conflict үүссэн.
2. Git-ийн зааварчилгаагаар .java файлд merge conflict-ийг заасан <<<<<<<, =======, >>>>>>> хэсгүүдийг олж, Гар аргаар аль алиныг нь хослуулан хамгийн сүүлийн зөв код болгон өөрчилсөн. Дараа нь Git-д тэмдэглэж, commit хийсэн.   
3. Ашигласан Git командууд: 
    # 1. Салбаруудыг merge хийх гэж оролдсон
    git checkout develop
    git merge feature/add-multiplication
    git merge feature/add-division
    # 2. Conflict-ийг гараар зассан
    # 3. Зассан файлыг stage-д оруулсан
    git add src/main/java/lab01/sict/must/edu/mn/Calculator.java
    # 4. Conflict шийдэгдсэнийг commit хийсэн
    git commit -m "Merge conflict resolved between multiplication and division features"
