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
