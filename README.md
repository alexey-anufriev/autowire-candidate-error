## Reproducer for `@Bean(autowireCandidate = false)` problem

### Steps

`./mvnw clean test`

### Actual Result

```
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: 
Error creating bean with name 'org.springframework.boot.actuate.autoconfigure.metrics.task.TaskExecutorMetricsAutoConfiguration': 
Unsatisfied dependency expressed through method 'bindTaskExecutorsToRegistry' parameter 0: 
No qualifying bean of type 'java.util.Map<java.lang.String, java.util.concurrent.Executor>' available: 
expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {}
```

### Expected Result

No exceptions

### Observation

If the bean is not marked as `autowireCandidate = false` the no errors appear.
