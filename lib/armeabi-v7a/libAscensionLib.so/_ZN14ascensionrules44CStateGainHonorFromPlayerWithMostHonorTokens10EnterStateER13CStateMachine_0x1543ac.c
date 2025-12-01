// 函数: _ZN14ascensionrules44CStateGainHonorFromPlayerWithMostHonorTokens10EnterStateER13CStateMachine
// 地址: 0x1543ac
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

void* r12 = *(arg1 + 0x24c)
void* r1 = *(r12 + 4)
int32_t* r3 = *(r1 + 0x18)
int32_t lr = *(r1 + 0x1c)

if (r3 == lr)
    return 

int32_t r1_1 = 0xffffffff
int32_t* r2_1 = r3

do
    void* r4_1 = *r2_1
    r2_1 = &r2_1[1]
    int32_t r4_2 = *(r4_1 + 0x90)
    
    if (r4_2 s> r1_1)
        r1_1 = r4_2
while (lr != r2_1)

if (r1_1 s< *(r12 + 0x90) || r3 == lr)
    return 

do
    void* r2_3 = *r3
    
    if (r2_3 != r12 && *(r2_3 + 0x90) s>= r1_1)
        void* var_14 = r2_3
        CGameStateOptions::AddSimpleUserOption(arg1.w, *(r2_3 + 8), 0xa0e0, "Take Honor from %s", 
            ascensionrules::CStateGainHonorFromPlayerWithMostHonorTokens::SelectTakeHonor)
        return 
    
    r3 = &r3[1]
while (lr != r3)
