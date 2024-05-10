Using provided command try generate native shared image of jar library.
You can verify library via 2 client apps.
For C app compile provided main.cpp via clang compiler via below command
  clang -I ./ -L ./ -l dinterfacepoc -o main.exe main.cpp
If you want to verify via .Net client. Copy the generated shared librarary inside .Net Client and just run the exe.

Please note you need to have folder C:\Test where application should create append.txt containing name of the annotated class which is HelloVisitor.
