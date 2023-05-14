
package hudson.cli;

import jenkins.model.Jenkins;
import hudson.model.ListView;

Jenkins jenkins = Jenkins.getInstance()


matrixJob('course_time_line_builder_athna_main') {
    description('This is an course_time_line_builder_athna_main Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }


    steps {
        shell('echo "Im course_time_line_builder_athna_main"')
    }
            publishers {
              downstream('employee_life_time_learning_time_line_b_athna_m')
                   }
                             
myView = hudson.model.Hudson.instance.getView('Athna')
myView.doAddJobToView('course_time_line_builder_athna_main') 
jenkins.save()

}

