# RelationshipAnnoation
Hibernate映射关系注解（个人觉得是对这一知识点简单易懂的总结）


一对一单向外键：@OneToOne

一对一双向外键关联：@OneToOne(mappedBy="xxx")

一对一单向外键联合注解：@Embeddable @EmbeddeId

多对一单向外键关联：@ManyToOne @JoinColumn

一对多单向外键关联：@OneToMany @JoinColumm

一对多双向外键关联：@ManyToOne @OneToMany

多对多双向外键关联：@ManyToMany @JoinTable

多对多双向外键关联：@ManyToMany(mappedBy="xxx") @JoinTable
