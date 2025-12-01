// 函数: _ZN14ascensionrules32IfIsDayOrPlayedMechanaConstructsEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x1025f0
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t result = 1
int32_t r0 = *__stack_chk_guard
int32_t var_28 = 1
void var_1e
bool var_1d
ascension::CWorld::GetCenterRowDayNight(arg1, arg2, &var_1d, &var_1e)

if (zx.d(var_1d) == 0)
    result = 0
    
    if (ascension::CWorld::GetPlayedConstructCount(arg1, true, 1) s>= arg4)
        result = 1

if (*__stack_chk_guard == r0)
    return result

__stack_chk_fail()
noreturn
