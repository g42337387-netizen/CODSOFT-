Same tree:
#include<stdbool.h>
struct TreeNode{
    int val;
    struct TreeNode*left;
    struct TreeNode*right;
};
bool isSameTree(struct TreeNode*p,struct TreeNode*q){
    if(p==Null && q==Null){
        return true;
    }
    if(p==Null || q==Null){
        return false;
    }
    if(p->val!=q->val){
        return false;
    }
    return isSameTree(p->left,q->left)&&isSameTree(p->right,q->right);
}



Binary traverse tree
#include<stdio.h>
#include<stdlib.h>
struct bt
{
int data;
struct bt*left;
struct bt*right;
};
struct bt*insert(struct bt*q,int val,char dir){
struct bt*temp;
temp=(struct bt*)malloc(sizeof(struct bt));
temp->data=val;
temp->left=temp->right=NULL;
if(dir=='l')
q->left=temp;
else
q->right=temp;
}

void postorder(struct bt*q){
if(q==NULL){
return;
}
postorder(q->left);
postorder(q->right);
printf(" %d",q->data);

}

void inorder(struct bt*q){
if(q==NULL){
return;
}
inorder(q->left);
printf(" %d",q->data);
inorder(q->right);
}
void preorder(struct bt*q){
if(q==NULL){
return;
}
printf(" %d",q->data);
preorder(q->left);
preorder(q->right);
}
int main()
{
struct bt*root=(struct bt *)malloc(sizeof(struct bt));
root->data=-1;
insert(root,3,'l');
insert(root,2,'r');
insert(root->left,5,'l');
insert(root->left,5,'l');
insert(root->right,7,'l');
printf("\n display elements in postorder:-");
postorder(root);
printf("\n display elements in inorder:-");
inorder(root);
printf("\n display elements in preorder:-");
preorder(root);
return 1;
}


Binary search tree
#include<stdio.h>
#include<stdlib.h>
struct bst
{
int data;
struct bst*left;
struct bst*right;
};
struct bst*insert(struct bst*q,int val)//root,value*/
{
struct bst*temp;
if(q==NULL){

temp=(struct bst*)malloc(sizeof(struct bst));
temp->data=val;
temp->left=temp->right=NULL;
q=temp;
}
else{

 if(val<q->data)
{
q->left=insert(q->left,val);
}
else
{
q->right=insert(q->right,val);
}
}
return q;
}
void inorder(struct bst*q){
if(q==NULL){
    return;
}
inorder(q->left);
printf("%d\t",q->data);
inorder(q->right);
}
struct bst*search(struct bst*p,int key,struct bst**y){
struct bst*temp;
if(p==NULL)
return(NULL);
temp=p;
*y=NULL;
while(temp!=NULL){
if(temp->data==key)
return(temp);
else{
*y=temp;/*store this pointer as root*/
if(temp->data>key)
temp=temp->left;
else
temp=temp->right;
}}
return(NULL);
}
int main()
{
    struct bst*root;
root=NULL;
int n,val,num;
printf("\n enter no of terms:- ");
scanf("%d",&n);
while(n!=0){
    printf("\n enter elements:- ");
    scanf("%d",&val);
    root=insert(root,val);
    n--;
}
printf("\n display elements:-.......");
inorder(root);
return 1;

}




Binary tree
#include<stdio.h>
#include<stdlib.h>
struct bt
{
int data;
struct bt*left;
struct bt*right;
};
struct bt*insert(struct bt*q,int val,char dir){
struct bt*temp;
temp=(struct bt*)malloc(sizeof(struct bt));
temp->data=val;
temp->left=temp->right=NULL;
if(dir=='l')
q->left=temp;
else
q->right=temp;
}

void postorder(struct bt*q){
if(q==NULL){
return;
}
postorder(q->left);
postorder(q->right);
printf(" %d",q->data);

}

void inorder(struct bt*q){
if(q==NULL){
return;
}
inorder(q->left);
printf(" %d",q->data);
inorder(q->right);
}
void preorder(struct bt*q){
if(q==NULL){
return;
}
printf(" %d",q->data);
preorder(q->left);
preorder(q->right);
}
int main()
{
struct bt*root=(struct bt *)malloc(sizeof(struct bt));
root->data=-1;
insert(root,3,'l');
insert(root,2,'r');
insert(root->left,5,'l');
insert(root->left,5,'l');
insert(root->right,7,'l');
printf("\n display elements in postorder:-");
postorder(root);
printf("\n display elements in inorder:-");
inorder(root);
printf("\n display elements in preorder:-");
preorder(root);
return 1;
}

