


matrixJob('course_playlist_accumulated_bloom_filter_b_m') {
    description('This is an course_playlist_accumulated_bloom_filter_b_m Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString('ALL')
                }
      
        }


    steps {
        shell('echo "Im course_playlist_accumulated_bloom_filter_b_m"')
    }
            publishers {
              downstream('playlist_recommendations_b_m')
                   }
}

