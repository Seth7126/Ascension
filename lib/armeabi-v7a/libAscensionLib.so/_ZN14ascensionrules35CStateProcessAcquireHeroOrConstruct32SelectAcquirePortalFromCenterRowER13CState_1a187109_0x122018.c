// 函数: _ZN14ascensionrules35CStateProcessAcquireHeroOrConstruct32SelectAcquirePortalFromCenterRowER13CStateMachineP6CStateiPj
// 地址: 0x122018
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t lr
int32_t var_4 = lr
ascension::CPlayer* r6 = *(arg2 + 0x24c)
core::CCardInstance* result = ascension::CWorld::GetCenterRowCard(*(r6 + 4))

if (result == 0)
    return result

uint32_t r2 = 1

if (zx.d(*(arg2 + 0x252)) == 0)
    r2 = 3

ascensionrules::CreateStateProcessAcquirePortal(r6, result, 7, arg3, r2)
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
