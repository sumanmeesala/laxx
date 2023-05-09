matrixJob('course_subject_accumulated_bloom_filter_builder_main') {
    description('This is an course_subject_accumulated_bloom_filter_builder_main Job DSL job')
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
        shell('echo "Im course_subject_accumulated_bloom_filter_builder_main"')
    }
            publishers {
              downstream('subject_recommendations_builder_main')
                   }
}
