
package hudson.cli;

import jenkins.model.Jenkins;
import hudson.model.ListView;

Jenkins jenkins = Jenkins.getInstance()


matrixJob('employee_location_timeline_b_m_athna') {
    description('This is an employee_location_timeline_b_m_athna Job DSL job')
       axes {
           axis {
                 name('corpId')
                 valueString(CC_CLIENTS)
                }
      
        }

    steps {
        shell('echo "Im employee_location_timeline_b_m_athna"')
    }
            publishers {
              downstream('employee_department_timeline_b_m_athna')
                   }
                             
myView = hudson.model.Hudson.instance.getView('Athna')
myView.doAddJobToView('employee_location_timeline_b_m_athna') 
jenkins.save()

}
