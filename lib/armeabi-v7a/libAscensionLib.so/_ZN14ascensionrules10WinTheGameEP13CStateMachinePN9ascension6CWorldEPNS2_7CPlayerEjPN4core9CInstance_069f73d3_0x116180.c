// 函数: _ZN14ascensionrules10WinTheGameEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x116180
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard

if (zx.d(*(arg2 + 0xb1c)) == 0)
    int32_t var_24_1 = 0
    int32_t* var_28 = nullptr
    int32_t var_20_1 = 0
    ascension::CWorld::CalculateResultOrder(arg2, &var_28, 1)
    int32_t* r7_1 = var_28
    int32_t r0_3 = var_24_1
    
    if (r7_1 != r0_3)
        do
            *r7_1
            core::CWorldBase::AddResultPlayer(arg2)
            r0_3 = var_24_1
            r7_1 = &r7_1[1]
        while (r7_1 != r0_3)
        
        r7_1 = var_28
    
    if (r0_3 != r7_1)
        core::CWorldBase::OutputMessageFormat(arg2, "%s wins!\n", *r7_1 + 0x10)
    
    int32_t var_30_1 = 0
    ascension::CWorld::OutputEvent(arg2, 0x28, zx.d(*(arg3 + 8)), zx.d(*(arg5 + 8)))
    core::CWorldBase::SetGameComplete(arg2.b)
    int32_t var_30_2 = 0
    ascension::CWorld::OutputEvent(arg2, 0x23, 0, 0)
    int32_t* r0_11 = var_28
    
    if (r0_11 != 0)
        int32_t* var_24_2 = r0_11
        operator delete(r0_11)

int32_t r0_12 = *__stack_chk_guard

if (r0_12 == r0)
    return r0_12 - r0

__stack_chk_fail()
noreturn
