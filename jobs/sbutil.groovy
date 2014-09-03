job {
    name 'SButil'
    description 'This is the sbutil helpful java library'
    concurrentBuild true
    scm {
        git {
                remote{
                        url('https://github.com/statsbiblioteket/sbutil')
                }
        }
    }
    triggers {
        githubPush()
    }
    jdk 'java7'
    steps {
        maven{
                goals ('-Psbforge-nexus')
                goals('clean')
                goals('package')
        }
    }
}

