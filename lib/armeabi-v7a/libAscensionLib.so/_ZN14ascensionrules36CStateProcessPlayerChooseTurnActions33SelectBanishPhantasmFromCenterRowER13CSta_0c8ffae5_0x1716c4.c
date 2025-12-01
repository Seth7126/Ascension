// 函数: _ZN14ascensionrules36CStateProcessPlayerChooseTurnActions33SelectBanishPhantasmFromCenterRowER13CStateMachineP6CStateiPj
// 地址: 0x1716c4
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

ascension::CPlayer* r8 = *(arg2 + 0x24c)
int32_t r9 = 0
int32_t r7 = *(r8 + 4)

if (ascension::CWorld::GetCenterRowCard(r7) != arg3)
    r9 = 1
    
    if (ascension::CWorld::GetCenterRowCard(r7) != arg3)
        r9 = 2
        
        if (ascension::CWorld::GetCenterRowCard(r7) != arg3)
            r9 = 3
            
            if (ascension::CWorld::GetCenterRowCard(r7) != arg3)
                r9 = 4
                
                if (ascension::CWorld::GetCenterRowCard(r7) != arg3)
                    r9 = 5
                    
                    if (ascension::CWorld::GetCenterRowCard(r7) != arg3)
                        r9 = 7
                        
                        if (ascension::CWorld::GetCenterRowCard(r7) == arg3)
                            r9 = 6

void* r4 = *(arg3 + 0xc)
core::CWorldBase::OutputMessageFormat(r7, "%s banishes %s for Phantasm\n", r8 + 0x10, r4 + 4)

if (zx.d(*(r7 + 0xb3d)) == 0 || *(r7 + 0xb48) s< 1)
    ascension::CPlayer::RemoveInsightCount(r8)
else
    uint32_t r0_17 = zx.d(*(r7 + 0xb29))
    
    if (r0_17 != 0)
        r0_17 = 8
    
    ascensionrules::CreateStateMustPayResources(r8, arg3, 0, 0, *(r4 + 0xb4), r0_17, 8, 0)
    CState::AddOwnedChild(arg2)
    CStateList::AppendState(arg2)

int32_t var_38_2 = 0
ascension::CWorld::OutputEvent(r7, 0x41, zx.d(*(r8 + 8)), zx.d(*(arg3 + 8)))
CState::CleanupEmbeddedState()
void** r6_2 = *(arg2 + 0x20)
CState::CState()
*r6_2 = _vtable_for_ascensionrules::CStatePlayPhantasmFromCenterRow + 8
r6_2[0xc] = r8
r6_2[0xd] = r9
r6_2[0xe] = arg3
r6_2[0xf] = 0
r6_2[0x10] = _vtable_for_ascension::CEventPlayHero + 8
r6_2[0x11] = 0x14
r6_2[0x12] = 0
r6_2[0x23] = 0
r6_2[0x24] = 0
r6_2[0x25].b = 0
r6_2[0x26] = 0
r6_2[0xb].b = 0
CState::SetEmbeddedState(arg2)
return CStateList::AppendState(arg2) __tailcall
