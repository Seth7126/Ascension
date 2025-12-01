// 函数: _ZN14ascensionrules43DefeatMonsterWithLessPowerThanContructValueEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x10c448
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
int32_t* result = *(arg3 + 0x54)
int32_t r3 = *(arg3 + 0x58)

if (result != r3)
    int32_t r1 = 0
    
    do
        void* r6_1 = *result
        result = &result[1]
        int32_t r7_1 = 0x98
        
        if (*(arg2 + 0x30) u< 0x14)
            r7_1 = 0x9c
        
        int32_t r6_4 = *(*(*(r6_1 + 0x10) + 0xc) + r7_1)
        
        if (r6_4 s> r1)
            r1 = r6_4
    while (r3 != result)
    
    if (r1 s>= 1)
        ascensionrules::CreateStateProcessDefeatMonsterWithLessPower(arg3, r1, false, false, false, 
            false, false, arg5, arg6)
        return CStateMachine::PushListState(arg1) __tailcall

return result
