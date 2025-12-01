// 函数: _ZN14ascensionrules36IfConstructEffectDataEquals0AndIsDayEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0xff770
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r0 = *__stack_chk_guard
uint32_t result = 0

if (ascension::CCardInPlayInstance::GetEffectData(arg3) == 0)
    int32_t var_28_1 = 1
    void var_1e
    bool result_1
    ascension::CWorld::GetCenterRowDayNight(arg1, arg2, &result_1, &var_1e)
    result = zx.d(result_1)
    
    if (result != 0)
        result = 1

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
