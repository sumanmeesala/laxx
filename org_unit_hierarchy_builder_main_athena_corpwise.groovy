matrixJob('org_unit_hierarchy_builder_main_athena_corpwise') {
    description('This is an org_unit_hierarchy_builder_main_athena_corpwise Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString('ALL')
                }
      
        }
    scm {
        git('https://github.com/sumanmeesala/laxx.git')
    }

    steps {
        shell('echo "Im org_unit_hierarchy_builder_main_athena_corpwise"')
    }
            publishers {
              downstream('employee_dim_attributes_builder_main_athena')
                   }
}
