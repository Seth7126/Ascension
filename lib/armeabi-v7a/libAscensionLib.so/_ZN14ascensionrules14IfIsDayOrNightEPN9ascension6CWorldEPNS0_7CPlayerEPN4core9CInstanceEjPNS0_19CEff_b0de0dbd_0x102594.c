// 函数: _ZN14ascensionrules14IfIsDayOrNightEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x102594
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2 = *__stack_chk_guard
int32_t var_20 = 1
char var_16
bool var_15
ascension::CWorld::GetCenterRowDayNight(arg1, arg2, &var_15, &var_16)

if (*__stack_chk_guard == r2)
    return (zx.d(var_16) & 1) | zx.d(var_15)

__stack_chk_fail()
noreturn
