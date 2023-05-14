
package hudson.cli;

import jenkins.model.Jenkins;
import hudson.model.ListView;

Jenkins jenkins = Jenkins.getInstance()


matrixJob('course_subject_accumulated_bloom_filter_b_m') {
    description('This is an course_subject_accumulated_bloom_filter_b_m Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString('ALL')
                }
      
        }


    steps {
        shell('echo "Im course_subject_accumulated_bloom_filter_b_m"')
    }
            publishers {
              downstream('subject_recommendations_b_m')
                   }
                             
myView = hudson.model.Hudson.instance.getView('Athna')
myView.doAddJobToView('course_subject_accumulated_bloom_filter_b_m') 
jenkins.save()

}

