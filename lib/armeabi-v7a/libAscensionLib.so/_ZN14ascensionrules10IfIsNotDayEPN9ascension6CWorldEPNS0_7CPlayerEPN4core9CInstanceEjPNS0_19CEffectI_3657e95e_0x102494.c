// 函数: _ZN14ascensionrules10IfIsNotDayEPN9ascension6CWorldEPNS0_7CPlayerEPN4core9CInstanceEjPNS0_19CEffectInstanceDataEPNS0_6CEventE
// 地址: 0x102494
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r2 = *__stack_chk_guard
int32_t var_20 = 1
void var_16
bool i_1
ascension::CWorld::GetCenterRowDayNight(arg1, arg2, &i_1, &var_16)

if (*__stack_chk_guard != r2)
    __stack_chk_fail()
    noreturn

int32_t temp0 = 0
uint32_t i = zx.d(i_1)

while (i != 0)
    i u>>= 1
    temp0 += 1

return (0x20 - temp0) u>> 5
