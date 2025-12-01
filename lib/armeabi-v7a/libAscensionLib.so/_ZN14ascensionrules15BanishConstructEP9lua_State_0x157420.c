// 函数: _ZN14ascensionrules15BanishConstructEP9lua_State
// 地址: 0x157420
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t* r0 = lua_touserdata(arg1, 1)
void* r0_2 = lua_touserdata(arg1, 2)
core::CCardInstance* r4_1 = r0[1]
uint32_t r6 = *(r0_2 + 0x10)
int32_t var_20 = 0
ascension::CWorld::OutputAnimationCard(r4_1, r6, 6, 4, zx.d(r0[2].w), 9, 0, &__elf_header)

if (ascension::CPlayer::RemoveConstructFromPlay(r0) != 0)
    ascension::CPlayer::RemoveOwnedCard(r0)
    ascension::CWorld::PutCardInVoid(r4_1)
    ascension::CPlayer::AddTurnLog(r0, 6)
    core::CWorldBase::OutputMessageFormat(r4_1, "%s banishes %s from play\n", (*(*r0 + 0xc))(r0), 
        (*(*r6 + 0xc))(r6))

return 0
