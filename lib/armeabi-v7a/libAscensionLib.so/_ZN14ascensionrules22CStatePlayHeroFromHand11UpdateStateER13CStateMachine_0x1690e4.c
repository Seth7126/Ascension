// 函数: _ZN14ascensionrules22CStatePlayHeroFromHand11UpdateStateER13CStateMachine
// 地址: 0x1690e4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
CState::DeleteState(*(arg1 + 0xe8))
ascension::CPlayer* r1 = *(arg1 + 0x30)
int32_t r2 = *(arg1 + 0x38)
*(arg1 + 0xe8) = 0
ascension::CWorld* result = *(r1 + 4)
*(arg1 + 0x38) = r2 + 1
CState* entry_r1

if (r2 u> 3)
    return CStateMachine::PopState(entry_r1)

char* var_28_1
void* __offset(CStateMachine, 0x90) r1_1
bool r2_11

switch (r2)
    case 0
        if (*(result + 0x30) u>= 4)
            int32_t r2_3 = *(arg1 + 0x34)
            *(arg1 + 0x88) = r1
            *(arg1 + 0x8c) = r2_3
            int32_t var_24_1 = 0x800
            r1_1 = arg1 + 0x3c
            var_28_1 = arg1 + 0xec
        label_169264:
            r2_11 = true
        label_16926c:
            *(arg1 + 0xe8) =
                ascensionrules::CreateStateHandleEvent(result, r1_1, r2_11, 0, var_28_1, 0x800)
            return CStateMachine::PushState(entry_r1) __tailcall
        
        *(arg1 + 0x38) = 2
    label_1691e8:
        void* r2_8 = *(arg1 + 0x34)
        *(arg1 + 0xe4) = 1
        *(arg1 + 0xdc) = r1
        *(arg1 + 0xe0) = r2_8
        
        if (zx.d(*(*(r2_8 + 0xc) + 0xca)) == 0)
            r1_1 = arg1 + 0x90
            
            if (*(result + 0x30) u< 4)
                var_28_1 = arg1 + 0xec
                int32_t var_24_5 = 0x800
                goto label_169264
            
            *(arg1 + 0xe8) =
                ascensionrules::CreateStatePreHandleEvent(result, r1_1, arg1 + 0xec, 0x800)
            return CStateMachine::PushState(entry_r1) __tailcall
    case 1
        goto label_1691e8
    case 2
        core::CInstance* r3_1 = *(arg1 + 0x34)
        ascension::CEffect* r2_6 = *(*(r3_1 + 0xc) + 0xe8)
        
        if (r2_6 != 0)
            *(arg1 + 0xe8) = ascensionrules::CreateStateProcessCardEffect(result, r1, r2_6, r3_1, 
                arg1 + 0x90, arg1 + 0xec, 0x800)
            return CStateMachine::PushState(entry_r1) __tailcall
    case 3
        if (zx.d(*(*(*(arg1 + 0x34) + 0xc) + 0xca)) != 0)
            int32_t var_24_3 = 0x800
            r1_1 = arg1 + 0x90
            var_28_1 = arg1 + 0xec
            goto label_169264
        
        if (*(result + 0x30) u>= 4)
            var_28_1 = arg1 + 0xec
            r2_11 = false
            int32_t var_24_4 = 0x800
            r1_1 = arg1 + 0x90
            goto label_16926c

return result
