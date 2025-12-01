// 函数: _ZN14ascensionrules30CStatePutMonsterUnderConstruct29SelectCardToPutUnderConstructER13CStateMachineP6CStateiPj
// 地址: 0x14072c
// 来自: E:/torrent/Cursor/com.playdekgames.android.Ascension_2.4.17-APK_Award-Mod/lib/armeabi-v7a/libAscensionLib.so.bndb

int32_t r9 = *(arg2 + 0x24c)
int32_t r6 = *(r9 + 4)
ascension::CPlayer::AddTurnLog(r9, 8)
int32_t r8 = 0
void* r0_2 = ascension::CWorld::GetCenterRowCard(r6)

if (r0_2 == 0 || zx.d(*(r0_2 + 8)) != zx.d(*(arg3 + 8)))
    r8 = 1
    void* r0_5 = ascension::CWorld::GetCenterRowCard(r6)
    
    if (r0_5 == 0 || zx.d(*(r0_5 + 8)) != zx.d(*(arg3 + 8)))
        r8 = 2
        void* r0_8 = ascension::CWorld::GetCenterRowCard(r6)
        
        if (r0_8 == 0 || zx.d(*(r0_8 + 8)) != zx.d(*(arg3 + 8)))
            r8 = 3
            void* r0_11 = ascension::CWorld::GetCenterRowCard(r6)
            
            if (r0_11 == 0 || zx.d(*(r0_11 + 8)) != zx.d(*(arg3 + 8)))
                r8 = 4
                void* r0_14 = ascension::CWorld::GetCenterRowCard(r6)
                
                if (r0_14 == 0 || zx.d(*(r0_14 + 8)) != zx.d(*(arg3 + 8)))
                    r8 = 5
                    void* r0_17 = ascension::CWorld::GetCenterRowCard(r6)
                    
                    if (r0_17 == 0 || zx.d(*(r0_17 + 8)) != zx.d(*(arg3 + 8)))
                        r8 = 6
                        void* r0_20 = ascension::CWorld::GetCenterRowCard(r6)
                        
                        if (r0_20 == 0)
                            r8 = 0xffffffff
                        else if (zx.d(*(r0_20 + 8)) != zx.d(*(arg3 + 8)))
                            r8 = 0xffffffff

uint32_t var_38 = zx.d(*(r9 + 8))
ascension::CWorld::OutputAnimationCard(r6, arg3, 8, 7, r8, 0x16, zx.d(*(*(arg2 + 0x250) + 8)), 2)
core::CWorldBase::OutputMessageFormat(r6, "%s puts %s under %s\n", r9 + 0x10, 
    (*(*arg3 + 0xc))(arg3), (*(**(arg2 + 0x250) + 0xc))())
ascension::CConstructInstance::PutCardUnderConstruct(*(arg2 + 0x250))
int32_t* r0_32 = *(arg2 + 0x254)

if (r0_32 != 0)
    void* r2_2 = r0_32 + *r0_32 + 4
    uint32_t r1_21 = zx.d(*r2_2)
    
    if (r1_21 u<= 7)
        uint32_t r3_1 = zx.d(*(arg3 + 8))
        *r2_2 = r1_21.b + 1
        r0_32[*r0_32 * 8 + r1_21 + 4] = r3_1

*(*(arg2 + 0x250) + 0x10)
ascension::CWorld::PopResolveEffect(r6)
void* r0_37 = *(arg2 + 0x250)
int32_t var_38_1 = 0
ascension::CWorld::OutputAnimationCard(r6, *(r0_37 + 0x10), 1, 0xb, 0, 4, zx.d(*(r0_37 + 8)), 0)
ascensionrules::CreateStateRemoveCenterRowCard(r9, r8, nullptr, true, false, 0, 0, false, nullptr, 
    nullptr, 0, nullptr, 0)
CState::AddOwnedChild(arg2)
return CStateList::AppendState(arg2) __tailcall
