// 函数: _ZN9ascension7CPlayer10AddTurnLogEiPN4core13CCardInstanceE
// 地址: 0xef458
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r3 = *__stack_chk_guard
void* r0 = *(arg1 + 0x180)

if (r0 != 0)
    core::CCardInstance** r1 = *(r0 + 0x14)
    
    if (r1 u>= *(r0 + 0x18))
        std::__ndk1::vector<ascension::CPlayerTurnLog::TurnCardLogEntry, std::__ndk1::allocator<ascension::CPlayerTurnLog::TurnCardLogEntry> >::__push_back_slow_path<ascension::CPlayerTurnLog::TurnCardLogEntry>(
            r0 + 0x10)
    else
        *r1 = arg2
        core::CCardInstance* entry_r2
        r1[1] = entry_r2
        *(r0 + 0x14) += 8

int32_t r0_2 = *__stack_chk_guard

if (r0_2 == r3)
    return r0_2 - r3

__stack_chk_fail()
noreturn
