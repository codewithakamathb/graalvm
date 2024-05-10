#include <stdio.h>
#include <stdlib.h>
#include "dinterfacepoc.h"
#include "graal_isolate.h"
#include "graal_isolate_dynamic.h"

 int main(int argc, char **argv) {
    graal_isolate_t *isolate = NULL;
    graal_isolatethread_t *thread = NULL;

 if (graal_create_isolate(NULL, &isolate, &thread) != 0) {
     fprintf(stderr, "initialization error\n");
     return 1;
 }

 list_annotated_class(thread);

 }