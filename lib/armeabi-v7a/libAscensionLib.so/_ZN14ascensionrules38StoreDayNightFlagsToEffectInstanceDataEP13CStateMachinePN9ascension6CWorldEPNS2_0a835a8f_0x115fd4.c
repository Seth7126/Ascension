// 函数: _ZN14ascensionrules38StoreDayNightFlagsToEffectInstanceDataEP13CStateMachinePN9ascension6CWorldEPNS2_7CPlayerEjPN4core9CInstanceEPNS2_19CEffectInstanceDataEPNS2_6CEventE
// 地址: 0x115fd4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard

if (arg6 != 0)
    int32_t var_20_1 = 1
    char var_16
    bool var_15
    ascension::CWorld::GetCenterRowDayNight(arg2, arg3, &var_15, &var_16)
    void* r1_2 = arg6 + *arg6 + 4
    uint32_t r0_3 = zx.d(*r1_2)
    
    if (r0_3 u<= 7)
        uint32_t r12_1 = zx.d(var_15)
        uint32_t r3_1 = zx.d(var_16)
        *r1_2 = r0_3.b + 1
        *(arg6 + (*arg6 << 5) + (r0_3 << 2) + 0x10) = r12_1 | (r3_1 & 0x7f) << 1

int32_t r0_5 = *__stack_chk_guard

if (r0_5 == r0)
    return r0_5 - r0

__stack_chk_fail()
noreturn
